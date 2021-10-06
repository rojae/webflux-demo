package kr.rojae.webflux.movie;

import java.util.List;

public class Movie {
    public BoxOfficeResult boxOfficeResult;

    static class DailyBoxOfficeList {
        public String rnum;
        public String rank;
        public String rankInten;
        public String rankOldAndNew;
        public String movieCd;
        public String movieNm;
        public String openDt;
        public String salesAmt;
        public String salesShare;
        public String salesInten;
        public String salesChange;
        public String salesAcc;
        public String audiCnt;
        public String audiInten;
        public String audiChange;
        public String audiAcc;
        public String scrnCnt;
        public String showCnt;
    }

    static class BoxOfficeResult {
        public String boxofficeType;
        public String showRange;
        public List<DailyBoxOfficeList> dailyBoxOfficeList;
    }

}
