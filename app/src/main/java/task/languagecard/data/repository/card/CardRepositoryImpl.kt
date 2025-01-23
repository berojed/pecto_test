package task.languagecard.data.repository.card

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.readRawBytes
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import task.languagecard.di.IoDispatcher
import task.languagecard.model.network.NetworkCard
import javax.inject.Inject

class CardRepositoryImpl @Inject constructor(
    private val httpClient: HttpClient, @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) : CardRepository {
    override suspend fun getAllCard(): List<NetworkCard> {
        return withContext(ioDispatcher) {
            val response = httpClient.get("cards/curated_platform_cards/sm1_new_kap1.json")
            val jsonString = response.readRawBytes().decodeToString()

            return@withContext Json.decodeFromString(jsonString)
        }
    }

    override suspend fun getCard(id: Int): NetworkCard? {
        return withContext(ioDispatcher) {
            val list = getAllCard()
            return@withContext list.find { it.id == id }
        }
    }
}