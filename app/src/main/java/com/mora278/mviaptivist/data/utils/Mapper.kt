package com.mora278.mviaptivist.data.utils

import com.mora278.mviaptivist.data.models.CoffeeDTO
import com.mora278.mviaptivist.domain.models.CoffeeModel

fun CoffeeDTO.toDomain(): CoffeeModel =
    CoffeeModel(image = this.file)