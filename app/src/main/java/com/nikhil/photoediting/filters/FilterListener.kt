package com.nikhil.photoediting.filters

import ja.nikhil.photoeditor.PhotoFilter

interface FilterListener {
    fun onFilterSelected(photoFilter: PhotoFilter)
}