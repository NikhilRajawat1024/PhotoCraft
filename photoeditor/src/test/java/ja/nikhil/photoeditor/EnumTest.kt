package ja.nikhil.photoeditor

import ja.nikhil.photoeditor.shape.ShapeType
import junit.framework.TestCase.assertEquals
import org.junit.Assert
import org.junit.Test

class EnumTest {
    @Test
    fun testNumberOfViewTypes() {
        assertEquals(ViewType.values().size.toLong(), 4)
    }

    @Test
    fun testNumberOfPhotoFilterTypes() {
        assertEquals(PhotoFilter.values().size.toLong(), 24)
    }
}