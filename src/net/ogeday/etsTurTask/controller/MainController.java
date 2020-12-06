package net.ogeday.etsTurTask.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.ogeday.etsTurTask.contacsDAO.ContactsDAO;
import net.ogeday.etsTurTask.model.Contacts;

@Controller
public class MainController {

	@Autowired
	private ContactsDAO contactDAO;
	

	@RequestMapping(value = "/list")
	public ModelAndView listContact(ModelAndView model) {
		List<Contacts> listContact = contactDAO.list();
		model.addObject("listContact", listContact);
		model.setViewName("/contact_list");

		return model;
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView addContact(ModelAndView model) {

		Contacts newContact = new Contacts();
		model.addObject("contact", newContact);
		model.setViewName("/contact_form");

		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Contacts contact) {
		contactDAO.save(contact);
		return new ModelAndView("redirect:/contact_list");
	}
}
