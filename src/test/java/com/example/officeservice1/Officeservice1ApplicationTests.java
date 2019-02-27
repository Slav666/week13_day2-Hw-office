package com.example.officeservice1;

import com.example.officeservice1.repositories.FileRepository;
import com.example.officeservice1.repositories.FolderRepository;
import com.example.officeservice1.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Officeservice1ApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;


	@Test
	public void contextLoads() {
	}

}
