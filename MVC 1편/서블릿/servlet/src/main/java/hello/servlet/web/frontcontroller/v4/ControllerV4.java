package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

// / + ** + enter 치면 아래 주석 나옴
/**
 * @param paramMap
 * @param model
 * @return viewName
 */
public interface ControllerV4 {

    String process(Map<String, String> paramMap, Map<String, Object> model);
}
