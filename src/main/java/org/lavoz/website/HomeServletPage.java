package org.lavoz.website;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class HomeServletPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Database database = new Database();


        ServletOutputStream out = resp.getOutputStream();
        out.println("<!DOCTYPE html>\n" +
                "\n" +
                "<body>\n" +
                database.getArticle(1) +
                "</body>");


       /*ServletOutputStream out = resp.getOutputStream();

        out.println(
            "<!DOCTYPE html>\n" +
            "\n" +
            "<head>\n" +
            "  <meta charset=\"UTF-8\">\n" +
            "  <meta name=\"google\" content=\"notranslate\">\n" +
            "  <meta http-equiv=\"Content-Language\" content=\"en\">\n" +
            "  <link rel=\"stylesheet\" href=\"main.css\">\n" +
            "</head>\n" +
            "\n" +
            "<body>\n" +
            "\n" +
            "<div id=\"container\">\n" +
            "  <div id=\"top\">\n" +
            "    <div id=\"logo\">\n" +
            "      <center>\n" +
            "        <p><div style=\"text-align: center;\"><a href=\"index.html\">LA VOZ</a></div></p>\n" +
            "      </center>\n" +
            "    </div>\n" +
            "    <div id=\"menubar\">\n" +
            "      <ul id=\"menu\">\n" +
            "        <li><a href=\"NewsPage.html\">NEWS</a></li>\n" +
            "        <li><a href=\"AcademicsPage.html\">ACADEMICS</a></li>\n" +
            "        <li><a href=\"SportsPage.html\">SPORTS</a></li>\n" +
            "        <li><a href=\"StudentVoices.html\">STUDENT VOICES</a></li>\n" +
            "        <li><a href=\"link here\">ABOUT US</a></a></li>\n" +
            "      </ul>\n" +
            "    </div>\n" +
            "  </div>\n" +
            "  <div class=\"content\">\n" +
            "    <div class=\"newshilights\">\n" +
            "      <p class=\"sectionHeader\">Top Stories</p>\n" +
            "      <span class=\"toparticle\">\n" +
            "        <img class=\"image\" src=\"7ieMiUB.jpg\" alt=\"article image\">\n" +
            "        <h1 class=\"title\"><a href=\"link to article page\">Article 1 Title</a></h1>\n" +
            "        <p class=\"beginning\">Lorem ipsum dolor sit amet, fugit platonem interpretaris sit eu. Ea laoreet insolens temporibus mea. Duo nullam facilisis at, aliquip consulatu philosophia at sit. </p>\n" +
            "\t  </span>\n" +
            "      <span class=\"toparticle\">\n" +
            "\t    <img class=\"image\" src=\"7ieMiUB.jpg\" alt=\"article image\">\n" +
            "        <h1 class=\"title\"><a href=\"link to article page\">Article 2 Title</a></h1>\n" +
            "        <p class=\"beginning\">Lorem ipsum dolor sit amet, fugit platonem interpretaris sit eu. Ea laoreet insolens temporibus mea. Duo nullam facilisis at, aliquip consulatu philosophia at sit. </p>\n" +
            "\t  </span>\n" +
            "      <span class=\"toparticle\">\n" +
            "        <img class=\"image\" src=\"7ieMiUB.jpg\" alt=\"article image\">\n" +
            "        <h1 class=\"title\"><a href=\"link to article page\">Article 3 Title</a></h1>\n" +
            "        <p class=\"beginning\">Lorem ipsum dolor sit amet, fugit platonem interpretaris sit eu. Ea laoreet insolens temporibus mea. Duo nullam facilisis at, aliquip consulatu philosophia at sit. </p>\n" +
            "\t  </span>\n" +
            "    </div>\n" +
            "    <div id=\"trending\">\n" +
            "      <p class=\"sectionHeader\">Trending</p>\n" +
            "      <div id=\"trendingBar\">\n" +
            "        <div class=\"trend\"><a href=\"Article Link\"><div class=\"trendingText\">THIS IS A TRENDING ARTICLE</div><img src=\"oof.jpg\" alt=\"article image\"></a></div>\n" +
            "        <div class=\"trend\"><a href=\"Article Link\"><div class=\"trendingText\">THIS IS A TRENDING ARTICLE</div><img src=\"7ieMiUB.jpg\" alt=\"article image\"></a></div>\n" +
            "        <div class=\"trend\"><a href=\"Article Link\"><div class=\"trendingText\">THIS IS A TRENDING ARTICLE</div><img src=\"7ieMiUB.jpg\" alt=\"article image\"></a></div>\n" +
            "        <div class=\"trend\"><a href=\"Article Link\"><div class=\"trendingText\">This is a trending article</div><img src=\"7ieMiUB.jpg\" alt=\"article image\"></a></div>\n" +
            "        <div class=\"trend\"><a href=\"Article Link\"><div class=\"trendingText\">This is a trending article</div><img src=\"7ieMiUB.jpg\" alt=\"article image\"></a></div>\n" +
            "      </div>\n" +
            "    </div>\n" +
            "\n" +
            "    <div class=\"newshilights\">\n" +
            "      <p class=\"sectionHeader\">Top Stories</p>\n" +
            "      <span class=\"toparticle\">\n" +
            "        <img class=\"image\" src=\"7ieMiUB.jpg\" alt=\"article image\">\n" +
            "        <h1 class=\"title\"><a href=\"link to article page\">Article 1 Title</a></h1>\n" +
            "        <p class=\"beginning\">Lorem ipsum dolor sit amet, fugit platonem interpretaris sit eu. Ea laoreet insolens temporibus mea. Duo nullam facilisis at, aliquip consulatu philosophia at sit. </p>\n" +
            "\t  </span>\n" +
            "      <span class=\"toparticle\">\n" +
            "\t    <img class=\"image\" src=\"7ieMiUB.jpg\" alt=\"article image\">\n" +
            "        <h1 class=\"title\"><a href=\"link to article page\">Article 2 Title</a></h1>\n" +
            "        <p class=\"beginning\">Lorem ipsum dolor sit amet, fugit platonem interpretaris sit eu. Ea laoreet insolens temporibus mea. Duo nullam facilisis at, aliquip consulatu philosophia at sit. </p>\n" +
            "\t  </span>\n" +
            "      <span class=\"toparticle\">\n" +
            "        <img class=\"image\" src=\"7ieMiUB.jpg\" alt=\"article image\">\n" +
            "        <h1 class=\"title\"><a href=\"link to article page\">Article 3 Title</a></h1>\n" +
            "        <p class=\"beginning\">Lorem ipsum dolor sit amet, fugit platonem interpretaris sit eu. Ea laoreet insolens temporibus mea. Duo nullam facilisis at, aliquip consulatu philosophia at sit. </p>\n" +
            "\t  </span>\n" +
            "\n" +
            "  </div>\n" +
            "\n" +
            "  <!--<div id=\"sidebar\">\n" +
            "\t\tThis is the sidebar here we can put some stuff i guess im not sure what we want to use it for but it is here\n" +
            "  </div>-->\n" +
            "\n" +
            "</div>\n" +
            "</body>\n"
        );*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

}


