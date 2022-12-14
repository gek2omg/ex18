package com.example.ex18.board;

import com.example.ex18.board.dto.BoardSaveDto;
import com.example.ex18.board.entity.Board;
import com.example.ex18.member.MemberRepository;
import com.example.ex18.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    private final MemberRepository memberRepository;

    @Transactional
    public void saveBoardV1(BoardSaveDto boardSaveDto) {

        Long memberId = 1L; // 회원 시퀀스 임시 적용(세션, 쿠키, OAuth2.0 키로 대응)

        Member member = null;

        try {
            member = memberRepository.findById(memberId).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Board board = Board.saveBoard(member, boardSaveDto);

        boardRepository.save(board);
    }
}
