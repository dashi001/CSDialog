package org.csodev.csdialog;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CSOKDialog extends Dialog {

	private Context context = null;

	private TextView msgText;
	private TextView titleText; 
	private Button okBtn; 

	public static CSOKDialog createBuilder(Context context) {
		return new CSOKDialog(context);
	}
	
	public CSOKDialog(Context context) {
		this(context, R.style.CustomDialog);
		this.context = context;

	}

	public CSOKDialog(Context context, boolean cancelable,
			OnCancelListener cancelListener) {

		super(context, cancelable, cancelListener);
		this.context = context;
	}

	public CSOKDialog(Context context, int theme) {

		super(context, theme);
		this.context = context;
		setDialogContentView();
	}
	
	/**
	 * 设置dialog里面的view
	 */
	private void setDialogContentView()
	{

		// 加载自己定义的布局
		View view = LayoutInflater.from(context).inflate(R.layout.showdialog_ok, null);
		titleText = (TextView) view.findViewById(R.id.title_text);
		msgText = (TextView) view.findViewById(R.id.msg_text);
		okBtn = (Button) view.findViewById(R.id.ok_btn);
		okBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				CSOKDialog.this.dismiss();
			}
		});
		setContentView(view);
		
	}
	
	/**
	 * 设置显示的文字内容（传入string）
	 * @param msg
	 */
	public CSOKDialog setMsg(String msg) {

		if (null != msgText) {
			msgText.setText(msg);
		}
		return this;
	}

	/**
	 * 设置显示的文字内容（传入resId）
	 * @param msg
	 */
	public CSOKDialog setMsg(int resId) {

		if (null != msgText) {
			msgText.setText(context.getString(resId));
		}
		return this;
	}

	/**
	 * 设置显示的标题（传入string）
	 * @param msg
	 */
	public CSOKDialog setAlertTitle(String t) {

		if (null != titleText) {
			titleText.setText(t);
		}
		return this;
	}

	/**
	 * 设置显示的标题（传入resId）
	 * @param msg
	 */
	public CSOKDialog setAlertTitle(int resId) {

		if (null != titleText) {
			titleText.setText(context.getString(resId));
		} 
		
		return this;
		
	}

}