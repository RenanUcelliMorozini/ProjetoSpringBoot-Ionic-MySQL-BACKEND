package br.com.renanucelli.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.renanucelli.domain.Cliente;
import br.com.renanucelli.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
