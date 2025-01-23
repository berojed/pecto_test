package task.languagecard.data.repository.card

import task.languagecard.model.network.NetworkCard

interface CardRepository {
    suspend fun getAllCard(): List<NetworkCard>

    suspend fun getCard(id: Int): NetworkCard?
}