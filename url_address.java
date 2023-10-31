package JavaRushTests;

public class url_address {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if(url.startsWith("http")||url.startsWith("https")){
            int i=url.indexOf(":");
            String str=url.substring(0, i);
            return str;
        }
        else
            return "неизвестный";
}
    public static String checkDomain(String url) {
        if(url.endsWith("com")||url.endsWith("net")||url.endsWith("org")||url.endsWith("ru")){
            int i=url.indexOf(".");
            String str=url.substring(i, url.length());
            return str;
            }
        else
            return "неизвестный";
    }
}

