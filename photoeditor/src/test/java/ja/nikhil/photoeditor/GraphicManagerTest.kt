package ja.nikhil.photoeditor

import android.content.Context
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import androidx.test.core.app.ApplicationProvider
import ja.nikhil.photoeditor.Graphic
import ja.nikhil.photoeditor.GraphicManager
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import org.junit.Test
import com.nikhil.photoediting.R

@RunWith(RobolectricTestRunner::class)
class GraphicManagerTest {

    private var mContext = ApplicationProvider.getApplicationContext<Context>()

    @Test
    fun testGraphicMangerAddViews() {
        val id = R.layout.view_photo_editor_text
        val childId = R.id.frmBorder
        val photoEditorView = PhotoEditorView(mContext)
        val graphicManager = GraphicManager(photoEditorView, PhotoEditorViewState())
        val graphic: Graphic = object : Graphic(
            context = mContext,
            layoutId = id,
            viewType = ViewType.TEXT,
            graphicManager = graphicManager
        ) {

        }
        graphicManager.addView(graphic)

        // NOTE(lucianocheng): Expect 4 views: Image, Filter, Brush,
        //                     and the Graphic we just added.
        assertEquals(4, photoEditorView.childCount.toLong())
        assertNotNull(photoEditorView.findViewById(childId))
    }
}