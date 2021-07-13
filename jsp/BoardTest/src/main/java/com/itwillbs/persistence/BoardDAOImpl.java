package com.itwillbs.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	// 디비 연결/ 자원해제 객체 - SqlSession
	@Inject
	private SqlSession sqlsession;
	
	// mapper주소 (mapper.xml 파일안에 작성된 주소값)
	private final static String namespace = "com.itwillbs.mapper.BoardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		sqlsession.selectOne(namespace+".create", vo);
	}

	@Override
	public List<BoardVO> listALL() throws Exception {		
		return sqlsession.selectList(namespace+".listALL");
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		System.out.println("DAO : 서비스에서 read(Integer bno) 호출");	
		System.out.println("DAO : mapper에 있는 해당 sql 실행");
		
		BoardVO vo = sqlsession.selectOne(namespace+".read",bno);
		
		System.out.println("DAO : "+vo);
		System.out.println("DAO : 서비스로 sql 결과를 리턴");
		
		return vo;
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		System.out.println("DAO : 서비스가 modify(Interger bno) 호출");
		System.out.println("DAO : mapper sql 호출");
		
		sqlsession.update(namespace+".modify",vo);
		
		System.out.println("DAO : 정보 수정완료! 서비스로 이동");
		
		
		
	}

	@Override
	public void remove(Integer bno) throws Exception {
			// 서비스에서 호출
			// sqlsession 객체 사용하여 sql 호출
			sqlsession.delete(namespace+".remove", bno);
			// 서비스로 이동
		
		
	}

	
	
	
	
}
