package com.kh.chemin.mypage.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.chemin.map.model.vo.Place;
import com.kh.chemin.map.model.vo.PlaceAttachment;
import com.kh.chemin.map.model.vo.PlaceMenu;
import com.kh.chemin.mypage.model.dao.MypageDao;

@Service
public class MypageServiceImpl implements MypageService {
	@Autowired
	private MypageDao dao;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<Place> selectPlaceList(String userId) {
		List<Place> list = dao.selectPlaceList(sqlSession, userId);
		return list;
	}

	@Override
	public List<PlaceAttachment> selectAttachList(int plaNo) {
		List<PlaceAttachment> attachList = dao.selectAttachList(sqlSession,plaNo);
		return attachList;
	}

	@Override
	public List<PlaceMenu> selectMenuList(int plaNo) {
		List<PlaceMenu> menuList = dao.selectMenuList(sqlSession,plaNo);
		return menuList;
	}

	@Override
	public int placeDelete(int plaNo) {
		int result = dao.placeDelete(sqlSession, plaNo);
		return result;
	}

	@Override
	public Place placeSelect(int plaNo) {
		Place place = dao.placeSelect(sqlSession,plaNo);
		return place;
	}

	@Override
	public int placeUpdate(Place place, List<PlaceMenu> menuList, List<PlaceAttachment> attList) {
	/*	int result=0;
		int plaNo=0;*/
		
		int result = dao.placeUpdate(sqlSession, place);
	/*	plaNo = place.getPlaNo();
		
		if(menuList.size()>0) {
			for(PlaceMenu m : menuList) {
				m.setPlaNo(plaNo);
				result =dao.updateMenu(sqlSession, m);
			}
		}
		if(attList.size()>0) {
			for(PlaceAttachment a : attList) {
				a.setPlaNo(plaNo);
				result =dao.updateAttach(sqlSession, a);
			}
		}*/
		
		return result;
	}

}
