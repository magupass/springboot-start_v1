package board.board.dto;

import java.util.List;

import lombok.Data;

@Data
public class BoardDto {
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String creatorId;
	private String createdDatetime;
	private String updatorId;
	private String updatedDatetime;
	private String deletedYn;
	private List<BoardFileDto> fileList;
}
