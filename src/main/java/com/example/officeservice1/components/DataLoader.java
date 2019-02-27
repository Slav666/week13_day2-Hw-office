package com.example.officeservice1.components;

import com.example.officeservice1.models.File;
import com.example.officeservice1.models.Folder;
import com.example.officeservice1.models.User;
import com.example.officeservice1.repositories.FileRepository;
import com.example.officeservice1.repositories.FolderRepository;
import com.example.officeservice1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        User user = new User("Slav");
        userRepository.save(user);

        Folder xfiles =new Folder("xfiles666", user);
        folderRepository.save(xfiles);



        File a = new File("a", ".txt", 17, xfiles);
        fileRepository.save(a);





    }

}