package testers;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.*;   // instead of  import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import git.Blob23;
import git.Commit;
import git.Index;

public class JunitTester {
	@Test
	public void test() throws Exception {
		File j = new File("objects/6b6bcc0ae63fbfb00dc13c06dab4fa2bff894882.txt");//commit tests
		assertTrue(j.exists());
		Commit h = new Commit(j, "a", "b", "c");
		assertTrue(h.test().equals("objects\6b6bcc0ae63fbfb00dc13c06dab4fa2bff894882.txt"));
	}
}
