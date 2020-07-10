package wasteed.project.template;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Card extends Dialog
{
    ConditionCard Condition=ConditionCard.NONE;
    public void SetListener()
    {
        final Dialog card=this;
        Button BtnYes=this.findViewById(R.id.Yes);
        BtnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Condition=ConditionCard.YES;
                card.dismiss();
            }
        });
        Button BtnNo=this.findViewById(R.id.No);

        BtnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Condition=ConditionCard.NO;
                card.dismiss();
            }
        });
    }

    public Card(@NonNull Context context)
    {
        super(context);
    }

    public Card(@NonNull Context context, int themeResId)
    {
        super(context, themeResId);
    }

    protected Card(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

}
