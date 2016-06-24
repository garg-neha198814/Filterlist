package betasoft.com.filterlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Rakshit on 13/4/16, 3:54 PM.
 */
public class ExampleViewHolder extends RecyclerView.ViewHolder {

    private final TextView tvText;

    public ExampleViewHolder(View itemView) {
        super(itemView);
        tvText = (TextView) itemView.findViewById(R.id.tvText);
    }

    public void bind(ExampleModel model) {
        tvText.setText(model.getText());
    }
}