package com.jingchen.pagerdemo;

import java.util.List;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class ScanViewAdapter extends PageAdapter
{
	Context context;
	List<String> items;
	AssetManager am;

	public ScanViewAdapter(Context context, List<String> items)
	{
		this.context = context;
		this.items = items;
		am = context.getAssets();
	}

	public void addContent(View view, int position)
	{
		TextView content = (TextView) view.findViewById(R.id.content);
		TextView tv = (TextView) view.findViewById(R.id.index);
		if ((position - 1) < 0 || (position - 1) >= getCount())
			return;
		content.setText("    ˫����ϣ�����纣�꣬�ޱ߿ձ̡��������Ӧ���ڣ���������š�˭�����ƣ�һ��δ����ҹ������ɫ���̳���������¥���������\n\n    ���Ϲ����£��������Σ��ְ������ġ����޷������ʣ��������ؽ�Ϧ��Բȱ�������Ž�ͬ�ޣ��Ҹ���Ϊ�͡�������ҹ����ǰ˭����İ��");
		tv.setText(items.get(position - 1));
	}

	public int getCount()
	{
		return items.size();
	}

	public View getView()
	{
		View view = LayoutInflater.from(context).inflate(R.layout.page_layout,
				null);
		return view;
	}
}
