package com.prodyna.mbb.sc;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.harness.ServerControls;
import org.neo4j.harness.TestServerBuilders;

import static org.neo4j.graphdb.Label.label;


/**
 * @TODO make simple integration test to ensure container start is possible
 * check https://github.com/eugenp/tutorials/blob/master/persistence-modules/spring-data-neo4j/src/main/java/com/baeldung/spring/data/neo4j/config/MovieDatabaseNeo4jTestConfiguration.java
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Ignore
public class ScApplicationTests {



	@Test
	public void contextLoads() {
	}

}
