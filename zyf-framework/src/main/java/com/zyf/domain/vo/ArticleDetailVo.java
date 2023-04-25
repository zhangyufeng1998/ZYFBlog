package com.zyf.domain.vo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDetailVo {
    private Long id;
    private String title;
    private String summary;
    private Long categoryId;
    private String categoryName;
    private String thumbnail;
    private String content;
    private Long viewCount;
    private Date createTime;
}
