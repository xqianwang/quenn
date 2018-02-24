package com.xqian.quenn.backend;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.datastax.driver.core.Cluster;
import com.google.common.base.Preconditions;

public class ClusterBuilder {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClusterBuilder.class);
	private static final String DEFAULT_CLUSTER_IP = "localhost";
	public static final int DEFAULT_CASSANDRA_PORT = 9042;
	
	public static ClusterBuilder builder() {
        return new ClusterBuilder();
    }
	
	private Optional<String> username;
	private Optional<String> password;
	
	private Optional<String> host;
	private Optional<Integer> port;
	
	public Cluster build() {
		Preconditions.checkState(username.isPresent() == password.isPresent(), "If you specify username, you must also specify password.");
		Cluster.Builder builder = Cluster.builder();
		
	}
	
}
