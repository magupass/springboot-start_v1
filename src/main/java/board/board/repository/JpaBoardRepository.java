package board.board.repository;

import board.board.entity.BoardEntity;
import board.board.entity.BoardFileEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaBoardRepository extends CrudRepository<BoardEntity, Integer> {
    List<BoardEntity> findAllByOrderByBoardIdxDesc();

    @Query("SELECT file FROM BoardEntity file WHERE board_idx = :boardIdx AND idx = :idx")
    BoardFileEntity findBoardFile(@Param("boardIdx") int boardIdx, @Param("idx") int idx);
}
