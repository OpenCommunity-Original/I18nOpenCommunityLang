# Minecraft Paper Plugin API - I18nOpenCommunityLang

The I18nOpenCommunityLang API provides a simple and efficient way to manage player locales and retrieve localized messages based on the player's locale. 

This repository serves as an example usage of the API. The Main class in this repository demonstrates how to initialize the API and use it to load and access localized messages for different languages.

## Features

* Automatic translation of plugin messages based on the player's locale. 
* Easy management of player locales. 
* Simple API to retrieve localized messages.
* Asynchronous message loading.
* Cached message retrieval.
* Automatic creation of Messages folder in plugin directory for storing language files.
* Adding new language files is as easy as adding a .lang file with the language code in the Messages folder.

## Usage

To use this API in your own plugin, you need to do the following:

1. Copy the `LocaleAPI.java` class file to your project.
2. Create an instance of LocaleAPI in your plugin's main class.
3. Register the LocaleAPI instance as an event listener.
4. Create a Messages folder in your project Resources.
5. Create a `.lang` file for each language you want to support. The file name should be in the format `language-code_REGION-code.lang`. For example, `en-US.lang` for American English or `fr-FR.lang` for French in France. You can find the language codes and region codes on websites such as http://www.lingoes.net/en/translator/langcode.htm.
6. To get a localized message, use the `LocaleAPI.getMessage(Player player, String messageKey)` method.

## Usage example:

```
String message = LocaleAPI.getMessage(player, "welcome_message");
```

The I18nOpenCommunityLang API is licensed under the MIT License.

