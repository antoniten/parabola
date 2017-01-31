package program.trytest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Григорий on 29.01.2017.
 */

public class MyDraw extends View {
    Canvas canvas;
    Paint paint = new Paint();

    public MyDraw (Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);


        paint.setColor(Color.BLACK);

        int i=0;
        float x=0, y=-0;
        while(i<1000)  {
            y=x*x;
            canvas.drawPoint(x, y, paint);
            x+=0.1;
            i++;
        }}

}




