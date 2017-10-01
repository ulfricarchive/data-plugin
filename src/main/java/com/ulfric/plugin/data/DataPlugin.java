package com.ulfric.plugin.data;

import com.ulfric.dragoon.activemq.ActiveContainer;
import com.ulfric.dragoon.conf4j.Conf4jContainer;
import com.ulfric.dragoon.curator.CuratorContainer;
import com.ulfric.dragoon.rethink.RethinkContainer;
import com.ulfric.dragoon.vault.VaultContainer;
import com.ulfric.plugin.Plugin;

public class DataPlugin extends Plugin {

	public DataPlugin() {
		install(Conf4jContainer.class);
		install(VaultContainer.class);
		install(ActiveContainer.class);
		install(RethinkContainer.class);
		install(CuratorContainer.class);
	}

}