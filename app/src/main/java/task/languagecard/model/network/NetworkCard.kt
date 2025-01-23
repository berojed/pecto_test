package task.languagecard.model.network

import kotlinx.serialization.Serializable

@Serializable
data class NetworkCard(
    val id: Int,
    val wordFirstLang: String,
    val sentenceFirstLang: String,
    val wordSecondLang: String,
    val sentenceSecondLang: String,
)
