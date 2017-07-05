package com.example;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Profile("stack")
@RestController
public class StackController {

	//queue 쪽 보시고 짜시면 되세용
}
