# Stalcraft API implementation in Kotlin
![maven central](https://img.shields.io/maven-central/v/tech.justagod/sc-api?versionSuffix=0.1.0)

This library provides a Kotlin implementation of the Stalcraft API. You can
read more about the API at https://eapi.stalcraft.net/.

This library uses Ktor as the HTTP client.

## Gradle dependency

```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation 'tech.justagod:sc-api:0.1.0'
}
```

## Usage

### With App token

```kotlin
    val client = StalcraftAppClient(StalcraftClient.BASE_URL, "token")
    val info = client.getClanInformation("RU", "647d6c53-b3d7-4d30-8d08-de874eb1d845")
    println(info)
```

### With User token

```kotlin
    val client = StalcraftUserClient(StalcraftClient.BASE_URL, "token")
    val list = client.getClanMembers("RU", "647d6c53-b3d7-4d30-8d08-de874eb1d845")
    println(list)
    // You can use user client to make app requests too
    val info = client.getClanInformation("RU", "647d6c53-b3d7-4d30-8d08-de874eb1d845") 
    println(info)
```

