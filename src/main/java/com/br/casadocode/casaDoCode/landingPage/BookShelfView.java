package com.br.casadocode.casaDoCode.landingPage;


import com.br.casadocode.casaDoCode.enums.Country;
import com.br.casadocode.casaDoCode.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;


@Getter
@Setter
@AllArgsConstructor
public class BookShelfView {

    private String name;

    private Genre genre;

    private boolean hardCover;

    private boolean onSale;

    private String author;

    private Country country;

    private DateTime lastSale;
}
