// ce Ctrl est un Ctrl REST
// cette classe peut traiter des requetes que je vais définir
// chaque méthode va renvoyer la réponse JSON à l'utilisateur

package com.eccad.eccad.controlleur;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eccad.eccad.dao.OrganizationRepository;
import com.eccad.eccad.model.Organization;

@RestController
public class MyController {

	@Autowired
	OrganizationRepository dao;

	// IOrganizationService organizationService;

	// Nous mappons une demande avec le chemin showCities à la méthode
	// findCities () du contrôleur.
	// La demande par défaut est une demande GET.
	// Le modèle obtient une liste de villes et le traitement est envoyé au
	// fichier de modèle showCities.html Thymeleaf.
	/*
	 * @RequestMapping("/showOrganizations") public String findCities(Model
	 * model) {
	 * 
	 * List<Organization> organizations = (List<Organization>)
	 * organizationService.findAll();
	 * 
	 * model.addAttribute("organizations", organizations);
	 * 
	 * return "showOrganizations"; }
	 */

	/*
	 * @GetMapping("/map") public String sendData() { String txt =
	 * dao.getData(); return txt; }
	 */

	// RECUPERER UN PRODUIT PAR SON ID
	@GetMapping(value = "/organizations/{id}")
	public Organization afficherUneOrganisation(@PathVariable int id) {
		Optional<Organization> found = dao.findById(id);
		return found.get();

	}
}