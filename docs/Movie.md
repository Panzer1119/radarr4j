# Movie

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**title** | **String** |  | 
**sortTitle** | **String** |  |  [optional]
**sizeOnDisk** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**overview** | **String** |  |  [optional]
**inCinemas** | **String** |  |  [optional]
**physicalRelease** | **String** |  |  [optional]
**images** | [**List&lt;Image&gt;**](Image.md) |  |  [optional]
**website** | **String** |  |  [optional]
**year** | **Integer** |  |  [optional]
**hasFile** | **Boolean** |  |  [optional]
**youTubeTrailerId** | **String** |  |  [optional]
**studio** | **String** |  |  [optional]
**path** | **String** |  |  [optional]
**rootFolderPath** | **String** |  |  [optional]
**qualityProfileId** | **Integer** |  |  [optional]
**monitored** | **Boolean** |  |  [optional]
**minimumAvailability** | [**MinimumAvailabilityEnum**](#MinimumAvailabilityEnum) |  |  [optional]
**isAvailable** | **Boolean** |  |  [optional]
**folderName** | **String** |  |  [optional]
**runtime** | **Integer** |  |  [optional]
**cleanTitle** | **String** |  |  [optional]
**imdbId** | **String** |  |  [optional]
**tmdbId** | **Integer** |  |  [optional]
**titleSlug** | **String** |  |  [optional]
**certification** | **String** |  |  [optional]
**genres** | **List&lt;String&gt;** |  |  [optional]
**tags** | **List&lt;Integer&gt;** |  |  [optional]
**added** | **String** |  |  [optional]
**ratings** | [**Rating**](Rating.md) |  |  [optional]
**collection** | [**Collection**](Collection.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | movie status |  [optional]

<a name="MinimumAvailabilityEnum"></a>
## Enum: MinimumAvailabilityEnum
Name | Value
---- | -----
ANNOUNCED | &quot;announced&quot;
INCINEMA | &quot;inCinema&quot;
RELEASED | &quot;released&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DELETED | &quot;deleted&quot;
TBA | &quot;tba&quot;
ANNOUNCED | &quot;announced&quot;
INCINEMA | &quot;inCinema&quot;
RELEASED | &quot;released&quot;
