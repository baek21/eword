package poly.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import poly.dto.OcrDTO;

public interface IOcrService {
	
	// 이미지 파일로부터 문자 읽고 MongoDB에 OCR결과 데이터 저장
	public OcrDTO ReadTextFromImage(OcrDTO pDTO) throws Exception;

	// OCR결과 목록 가져오기
	public List<OcrDTO> getOcrResultAll(String session_id) throws Exception;
	
	// OCR결과 목록 삭제
	void ocrResultDelete(HashMap<String, String> rList) throws Exception;

	// MongoDB에 저장된 이미지 데이터 가져오기
	public Map<String, String> getImageInfo(String reg_id, String reg_dt) throws Exception;
}