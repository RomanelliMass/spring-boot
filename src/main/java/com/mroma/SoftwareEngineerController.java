package com.mroma;
// Anything which accepts req from client or exposes rest api or endpoints should be named as Controllers


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping //for retrieval use GET
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "James",
                        "js, node, react, tailwindcss"
                ),
                new SoftwareEngineer(
                        2,
                        "Jamila",
                        "java, spring, spring boot"
                )
        );
    }


}
