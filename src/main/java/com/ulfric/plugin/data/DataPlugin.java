package com.ulfric.plugin.data;

import com.ulfric.dragoon.acrodb.AcrodbContainer;
import com.ulfric.dragoon.conf4j.Conf4jContainer;
import com.ulfric.dragoon.gson.GsonContainer;
import com.ulfric.plugin.Plugin;

public class DataPlugin extends Plugin {

	public DataPlugin() {
		install(GsonContainer.class);
		install(Conf4jContainer.class);
		install(AcrodbContainer.class);
	}

}
