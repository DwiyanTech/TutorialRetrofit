package com.dwiyanstudio.retrofittutorial

import com.google.gson.annotations.SerializedName

data class Character(@SerializedName("name") val name : String,@SerializedName("birthday") val birthday : String )