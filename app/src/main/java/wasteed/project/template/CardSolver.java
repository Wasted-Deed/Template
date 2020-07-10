package wasteed.project.template;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CardSolver
{
    ConditionCard Condition=ConditionCard.NONE;
    Dialog card;
    public CardSolver(Context context)
    {
        card=new Dialog(context);
        card.setContentView(R.layout.card);
        TextView h= card.findViewById(R.id.Text);
        h.setText(R.string.text_card);
        card.show();
        SetListener();
    }
    //Задания действий при нажатии на кнопки
    public void SetListener()
    {
        Button BtnYes=card.findViewById(R.id.Yes);
        BtnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Condition=ConditionCard.YES;
                card.dismiss();
            }
        });
        Button BtnNo=card.findViewById(R.id.No);

        BtnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Condition=ConditionCard.NO;
                card.dismiss();
            }
        });
    }
    //В зависимости от данных,выводится то или иное событие
    public void update(Player player)
    {

    }
}
