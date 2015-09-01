/**
 * 
 */
package org.dimigo.abstractclass;

/**
 *  <pre>
 * org.dimigo.abstractclass
 * |_DeleteAction
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 1. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class DeleteAction extends Action {

	@Override
	public void execute() {
		System.out.println("데이터를 삭제합니다.");
		
	}

}

