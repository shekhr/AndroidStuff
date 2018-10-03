package com.mycodelabs.jsonparsing;

/**
 * Created by shekharc on 22-Jun-16.
 */
// A dummy JSON response.
public class ConstantJson {

    public static final String json="{\n" +
            "    \"contacts\": [\n" +
            "        {\n" +
            "                \"id\": \"c200\",\n" +
            "                \"name\": \"Shahrukh Khan\",\n" +
            "                \"email\": \"shahrukh@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"male\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c201\",\n" +
            "                \"name\": \"Johnny Depp\",\n" +
            "                \"email\": \"johnny_depp@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"male\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c202\",\n" +
            "                \"name\": \"Leonardo Dicaprio\",\n" +
            "                \"email\": \"leonardo_dicaprio@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"male\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c203\",\n" +
            "                \"name\": \"John Wayne\",\n" +
            "                \"email\": \"john_wayne@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"male\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c204\",\n" +
            "                \"name\": \"Angelina Jolie\",\n" +
            "                \"email\": \"angelina_jolie@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"female\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c205\",\n" +
            "                \"name\": \"Dido\",\n" +
            "                \"email\": \"dido@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"female\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c206\",\n" +
            "                \"name\": \"Adele\",\n" +
            "                \"email\": \"adele@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"female\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c207\",\n" +
            "                \"name\": \"Hugh Jackman\",\n" +
            "                \"email\": \"hugh_jackman@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"male\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c208\",\n" +
            "                \"name\": \"Will Smith\",\n" +
            "                \"email\": \"will_smith@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"male\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c209\",\n" +
            "                \"name\": \"Clint Eastwood\",\n" +
            "                \"email\": \"clint_eastwood@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"male\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c2010\",\n" +
            "                \"name\": \"Barack Obama\",\n" +
            "                \"email\": \"barack_obama@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"male\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c2011\",\n" +
            "                \"name\": \"Kate Winslet\",\n" +
            "                \"email\": \"kate_winslet@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"female\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        },\n" +
            "        {\n" +
            "                \"id\": \"c2012\",\n" +
            "                \"name\": \"Eminem\",\n" +
            "                \"email\": \"eminem@gmail.com\",\n" +
            "                \"address\": \"xx-xx-xxxx,x - street, x - country\",\n" +
            "                \"gender\" : \"male\",\n" +
            "                \"phone\": {\n" +
            "                    \"mobile\": \"+91 0000000000\",\n" +
            "                    \"home\": \"00 000000\",\n" +
            "                    \"office\": \"00 000000\"\n" +
            "                }\n" +
            "        }\n" +
            "    ]\n" +
            "}";
}
