package com.sds.egosara.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

@Data
@Alias("goods")
public class GOODS {

    private int gNum;             // 상품 번호
    private String gId;           // 판매자
    private String gCate;         // 글카테고리
    private String gName;         // 상품이름
    private int gPrice;           // 가격
    private int gPrice1;          // 가격1(이상)
    private int gPrice2;          // 가격2(이하)
    private String selectVal;        // 선택 목록
    private String gDate;         // 유통기한
    private int gHit;             // 조회수
    private int gStock;           // 재고
    private String gContent;      // 상품내용
    private MultipartFile gFile;  // 업로드 파일
    private String gPhoto;     // 업로드 파일
    private String keyword;       // 키워드
    private double gStar;            // 리뷰 별점 평균


}
