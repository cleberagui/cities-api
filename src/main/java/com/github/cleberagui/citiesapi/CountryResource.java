package com.github.cleberagui.citiesapi;

import com.github.cleberagui.citiesapi.countries.entities.Country;
import net.bytebuddy.asm.Advice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Countries")

@GetMapping

public class CountryResource {

    public List<Country> countries() {
        return

    }
}
