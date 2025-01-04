package ja.nikhil.photoeditor

import ja.nikhil.photoeditor.DrawingView

/**
 * Created on 1/17/2018.
 * @author [Burhanuddin Rashid](https://github.com/nikhil)
 *
 *
 */
interface BrushViewChangeListener {
    fun onViewAdd(drawingView: DrawingView)
    fun onViewRemoved(drawingView: DrawingView)
    fun onStartDrawing()
    fun onStopDrawing()
}