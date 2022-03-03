package com.example.customlistapp3.placeholder;

import com.example.customlistapp3.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<Team> ITEMS = new ArrayList<Team>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, Team> ITEM_MAP = new HashMap<String, Team>();

    static {
        addItem(new Team("1", "Paraná Clube", "\nTítulos conquistados:\n" +
                "\n" +
                "Campeão Paranaense em 1991, 1993, 1994, 1995, 1996, 1997 e 2006;\n" +
                "\n" +
                "Campeão Brasileiro – série B – em 1992;\n" +
                "\n" +
                "Copa João Havelange – módulo amarelo – (equivalente à série B do Campeonato Brasileiro), em 2000.."));
        addItem(new Team("2", "Bahia", "\nTítulos conquistados:\n" +
                "Campeonato Brasileiro 2 títulos:\n" +
                "1959 e 1988\n" +
                "Copa do Nordeste 2 títulos:\n" +
                "2001 e 2002\n" +
                "Taça Estado da Bahia 3 títulos:\n" +
                "2000, 2002 e 2007\n" +
                "Campeonato Baiano 43 títulos:\n" +
                "1931, 1933, 1934, 1936, 1938, 1940, 1944 1945, 1947, 1948, 1949, 1950, " +
                "1952, 1954 1956, 1958, 1959, 1960, 1961, 1962, 1967, 1956, 1958, 1959, " +
                "1970, 1971, 1973, 1974, 1975, 1976, 1977, 1960, 1961, 1962, 1967, 1978 " +
                "1979, 1981, 1982, 1983, 1984, 1986, 1987, 1988, 1991, 1993, 1994, 1998 " +
                "1999, 2001"));
        addItem(new Team("3", "Bangu", "\nTítulos conquistados:\n" +
                "\n" +
                "Campeão Carioca Primeira Divisão: 1933 e 1966.\n" +
                "\n" +
                "Campeão Taça Rio: 1987 (INVICTO)\n" +
                "\n" +
                "Campeão Carioca Segunda Divisão: 1911,1914 e 2008.\n" +
                "\n" +
                "Campeão Torneio Início: 1934, 1950, 1955 e 1964.\n" +
                "\n" +
                "Campeão Seletiva de Acesso a 1ª Divisão de Profissionais: 2006.\n"));
        addItem(new Team("4", "Chapecoense", "\nTítulos conquistados:\n" +
                "\n" +
                "Campeonato Catarinense 1977, 1996, 2007, 2011, 2016 e 2017.\n" +
                "\n" +
                "Copa Santa Catarina 2006.\n" +
                "\n" +
                "Taça Santa Catarina 1979 e 2014.\n" +
                "\n" +
                "Torneio Seletivo 2004.\n" +
                "\n" +
                "Copa Sul-Americana 2016."));
    }

    private static void addItem(Team item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A placeholder item representing a piece of content.
     */
    public static class Team {
        public int img;
        public final String id;
        public final String teamName;
        public final String details;


        public Team(String id, String teamName, String details) {
            this.id = id;
            this.teamName = teamName;
            this.details = details;
        }


        @Override
        public String toString() {
            return teamName;
        }
    }

}