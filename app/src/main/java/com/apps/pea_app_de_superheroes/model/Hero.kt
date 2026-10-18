package com.apps.pea_app_de_superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Clase de datos que representa a un Héroe en la aplicación.
 *
 * @param nameRes ID del recurso de string para el nombre del héroe.
 * @param descriptionRes ID del recurso de string para la descripción del héroe.
 * @param imageRes ID del recurso drawable para la imagen del héroe.
 */
data class Hero(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)
