package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("theWizard")
public class Gandalf implements WizardInterface {
	private OutfitInterface outfit;
	
	@Autowired
    public Gandalf(@Qualifier("blackOutfit")OutfitInterface injectedOutfit) {
        outfit = injectedOutfit;
    }
	
	@Override
	public String giveAdvice() {
		return "You shall not pass!";
	}
	
	@Override
	public String revealDress() {
		return this.outfit.revealDress();
	}
}
