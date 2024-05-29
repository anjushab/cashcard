/**
 * 
 */
package example.cashcard;

import org.springframework.data.annotation.Id;

/**
 * @author anjushab
 *
 */
record CashCard(@Id Long id, Double amount, String owner) {
}
