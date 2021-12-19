package com.example.myapplication

object ColorPicker {
    val colors = arrayOf("#FFFF00", "#00FFFF", "#FF00FF", "#C0C0C0", "#800000", "#808000", "#008000", "#800080", "#008080","#000080", "#000000", "#F08080" )
    var colorIndex = 1

    fun getColor():String{
        return colors[colorIndex++ % colors.size]
    }
}