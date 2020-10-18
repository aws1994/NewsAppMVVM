package com.artsystem.newsapp.data;

import android.util.Log;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * this fake data source class is a testing class that will be used to generate some random data
 *
 */
/**
 * this class provides a List of news item
 * this is how the news item data looks like in JSON format:
 * {
 *         "id" : 0,
 *         "title" : "Design A Simple UI Screen in Flare",
 *         "itemType" : 1,
 *         "newsContent" : "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book. It usually begins with: The purpose of lorem ipsum is to create a natural looking block of text (sentence, paragraph, page, etc.) that doesn't distract from the layout. A practice not without controversy, laying out pages with meaningless filler text can be very useful when the focus is meant to be on design, not content.",
 *         "newsImg" : "https://2.bp.blogspot.com/-ddZ2Tt8EOeo/XxtDIkHWgDI/AAAAAAAAAn0/vG13Vw5zoXU5fy_sHQ_7lW6PQz1UEXocACK4BGAYYCw/s1600/news5.PNG",
 *         "userImg" : "https://2.bp.blogspot.com/-6EcFUPmzExo/XxtD9BbEO4I/AAAAAAAAAo0/n-AxAZrAVLQBbzjcKhkIOHtSLixVUz0lgCK4BGAYYCw/s400/user3.png",
 *         "username" : "Invision Studio",
 *         "date" : "03/08/2020",
 *         "backgroundBg" : "RED"
 *     }
 */

public class FakeDataSource {


    Random random;

    public FakeDataSource() {
        random = new Random();
        initListNewsImages();
        initListUserImages();
        initListNewsTitle();
        initListUsername();
    }

    /** News item data format
     *
     *   this.id = id;
     *         this.title = title;
     *         this.username = username;
     *         this.newsImg = newsImg;
     *         this.userImg = userImg;
     *         this.newsContent = newsContent;
     *         this.bgColor = bgColor;
     *         this.date = date;
     *         this.viewType = viewType;
     */

    public List<NewsItem> getFakeListNews() {


        List<NewsItem> data = new ArrayList<>();
        for(int index=0;index<30;index++) {

            NewsItem item = new NewsItem(index,
                    getRandomNewsTitle(),
                    getRandomUsername(),
                    getRandomNewsImage(),
                    getRandomUserImage(),
                    getRandomContent(),
                    getRandomBgColor(),
                    null,
                    generateViewType(index));
            data.add(item);

        }

        return data;
    }


    private void initListNewsImages() {
        listNewsImage.add(IMG_NEWS_01);
        listNewsImage.add(IMG_NEWS_02);
        listNewsImage.add(IMG_NEWS_03);
        listNewsImage.add(IMG_NEWS_04);
        listNewsImage.add(IMG_NEWS_05);
        listNewsImage.add(IMG_NEWS_06);
        listNewsImage.add(IMG_NEWS_07);
        listNewsImage.add(IMG_NEWS_08);
        listNewsImage.add(IMG_NEWS_09);
        listNewsImage.add(IMG_NEWS_10);
    }

    private void initListUserImages() {
        listUserImage.add(IMG_USER_01);
        listUserImage.add(IMG_USER_02);
        listUserImage.add(IMG_USER_03);
        listUserImage.add(IMG_USER_04);
        listUserImage.add(IMG_USER_05);
    }

    private void initListNewsTitle() {
        listNewsTitles.add(TXT_TITLE_01);
        listNewsTitles.add(TXT_TITLE_02);
        listNewsTitles.add(TXT_TITLE_03);
        listNewsTitles.add(TXT_TITLE_04);
        listNewsTitles.add(TXT_TITLE_05);
    }

    public void initListUsername(){
        listUserNames.add(TXT_NAME_01);
        listUserNames.add(TXT_NAME_02);
        listUserNames.add(TXT_NAME_03);
        listUserNames.add(TXT_NAME_04);
    }

    // news images url's for testing
    public static final String IMG_NEWS_01 ="https://2.bp.blogspot.com/-ddZ2Tt8EOeo/XxtDIkHWgDI/AAAAAAAAAn0/vG13Vw5zoXU5fy_sHQ_7lW6PQz1UEXocACK4BGAYYCw/s1600/news5.PNG";
    public static final String IMG_NEWS_02 ="https://4.bp.blogspot.com/-4QOyU3Q5D8c/XxtDIQ_pLmI/AAAAAAAAAns/FbocmpIje1YFxfqG5Ajln7OeJ8dX6h3wQCK4BGAYYCw/s1600/news3.PNG";
    public static final String IMG_NEWS_03 ="https://1.bp.blogspot.com/-dpcd0TBJ5xk/XxtDboRBeYI/AAAAAAAAAoE/CdWFJq1k8GsGgAwGTLGJd6ToCwvtO9OtwCK4BGAYYCw/s1600/newsimg2.PNG";
    public static final String IMG_NEWS_04 ="https://3.bp.blogspot.com/-Ele_lJ7t2Fg/XxtD9BfVm8I/AAAAAAAAAow/m8fpgF7Ocmcfs2rJ6nGP-Dsms5X5PQdwwCK4BGAYYCw/s1600/newsimg.png";
    public static final String IMG_NEWS_05 ="https://2.bp.blogspot.com/-4eQzZxP2ubw/Xx4XnCFRANI/AAAAAAAAAps/Xwugw45_OD8rfOw_CPgbJ6455IiAspF8wCK4BGAYYCw/s1600/illust2.jpg";
    public static final String IMG_NEWS_06 ="http://4.bp.blogspot.com/-aisXccEBqJY/Xx37Zdf7wMI/AAAAAAAAApg/8mbSFn0JvrIdIIRJrxoaU7GH0wsBOgCsACK4BGAYYCw/s640/illustration.jpg";
    public static final String IMG_NEWS_07 ="https://cdn.dribbble.com/users/1663335/screenshots/13906863/media/f82fca5285ba7260e7408cff9edb3fa7.jpg";
    public static final String IMG_NEWS_08 ="http://4.bp.blogspot.com/-aisXccEBqJY/Xx37Zdf7wMI/AAAAAAAAApg/8mbSFn0JvrIdIIRJrxoaU7GH0wsBOgCsACK4BGAYYCw/s640/illustration.jpg";
    public static final String IMG_NEWS_09 ="https://cdn.dribbble.com/users/2400016/screenshots/13897147/media/2e54a3ade13ebb2611c999e4178c133f.png";
    public static final String IMG_NEWS_10 ="https://cdn.dribbble.com/users/2400016/screenshots/11466370/image.png";

    List<String> listNewsImage = new ArrayList<>();

    // user images for testing
    public static final String IMG_USER_01 ="https://2.bp.blogspot.com/-6EcFUPmzExo/XxtD9BbEO4I/AAAAAAAAAo0/n-AxAZrAVLQBbzjcKhkIOHtSLixVUz0lgCK4BGAYYCw/s400/user3.png";
    public static final String IMG_USER_02 ="https://2.bp.blogspot.com/-R0rfeBv6PbA/XxtD75IBizI/AAAAAAAAAoU/xgUu9IuGwVcwpnihSXMNSZ9YhiNrIpTuwCK4BGAYYCw/s400/user4.png";
    public static final String IMG_USER_03 ="https://1.bp.blogspot.com/-7cV7-_0mgv8/XxtD9IRzJBI/AAAAAAAAAo4/WaMt1T9cfXgn1qGmnYa3oWGUEW2IQUbmACK4BGAYYCw/s400/user2.png";
    public static final String IMG_USER_04 ="https://cdn.dribbble.com/users/2400016/avatars/normal/401c4be556cfced8004233dad4afdd98.jpg?1592492657";
    public static final String IMG_USER_05 ="https://1.bp.blogspot.com/-crUZwpqquAo/XxtD7_lwqEI/AAAAAAAAAoY/TbRYnR82uk8LXrQpx-tsBA4-KyFISSFUgCK4BGAYYCw/s400/user.png";


    List<String> listUserImage = new ArrayList<>();


    // user titles for testing
    public static final String TXT_TITLE_01 = "Stack Overflow - Where Developers Learn, Share, and Build";
    public static final String TXT_TITLE_02 = "Book About Stars";
    public static final String TXT_TITLE_03 = "Design A Simple UI Screen in Flare";
    public static final String TXT_TITLE_04 = "Naija-based designer making stuff with Studio";
    public static final String TXT_TITLE_05 = "How To Write Better Resume";


    List<String> listNewsTitles = new ArrayList<>();


    // user names for testing
    public static final String TXT_NAME_01 = "Jona Dinges";
    public static final String TXT_NAME_02 = "Invision Studio";
    public static final String TXT_NAME_03 = "Benoit Drigny";
    public static final String TXT_NAME_04 = "Ada Vishneva";

    List<String>  listUserNames  = new ArrayList<>();


    // News content for testing
    public static final String LOREM_TEXT ="Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book. It usually begins with: The purpose of lorem ipsum is to create a natural looking block of text (sentence, paragraph, page, etc.) that doesn't distract from the layout. A practice not without controversy, laying out pages with meaningless filler text can be very useful when the focus is meant to be on design, not content." ;

    // news background colors
    static final String[] lstColors = {"RED","YELLOW","BLACK","PURPLE"};


    /**
     * this method generate a random news item
     */
    public void generateRandomNewsItem(){
        return;
    }

    // generate a random string title
    private String getRandomNewsTitle() {
        int index = random.nextInt(listNewsTitles.size());
        return listNewsTitles.get(index);
    }

    // generate a random news image url string
    private String getRandomNewsImage(){
        int index = random.nextInt(listNewsImage.size());
        return listNewsImage.get(index);
    }

    // generate a random news image url string
    private String getRandomUserImage(){
        int index = random.nextInt(listUserImage.size());
        return listUserImage.get(index);
    }

    // generate a random String Content
    private String getRandomContent(){
        return LOREM_TEXT;
    }

    // generate a random String Content
    private String getRandomUsername(){
        int index = random.nextInt(listUserNames.size());
        return listUserNames.get(index);
    }

    // generate a random news background color
    private String getRandomBgColor(){
        int index = random.nextInt(lstColors.length);
        return lstColors[index];
    }

    // generate random date
    private Date getRandomDate(){
        return new Date();
    }


    // generate a viewtype based on the index and the list size
    // this specify the view grid system of the format of the news system list

    private int generateViewType(int position){

        if (position == 0) {
            return 1;
        }
        else if (position == 1) {
            return 0;
        }

        if (position != 0) {
            int ir = position/2 +1 ;
            Log.e("TAG", "generateViewType: "+ir );
            if(ir%2 == 0) {
                if (position %2 == 0) {
                    return 0;
                }
                else
                    return 1;
            }
            else
            {
                if (position %2 == 0) {
                    return 1;
                }
                else
                    return 0;
            }

        }

        return 0;
    }

}
