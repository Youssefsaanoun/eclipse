package serviseImplementation;

import java.util.List;
import java.util.Optional;

import com.models.Etudiant;
import com.repository.EtudiantRepository;

import servise.EtudiantServise;

public class EtudiantServisesImplementation implements EtudiantServise {
	 private final  EtudiantRepository etudiantRepository;

	    public EtudiantServisesImplementation(EtudiantRepository etudiantRepository) {
	        this.etudiantRepository = etudiantRepository;
	    }

	    @Override
	    public List<Etudiant> GetAllEtudiant() {
	       return etudiantRepository.GetAllEtudiant();
	    }

	    @Override
	    public Optional<Etudiant> getEudiantById(Long id) {
	        return etudiantRepository.getEudiantById(id);
	    }

	    @Override
	    public void DeleteEtudiant(Long id) {
	        etudiantRepository.DeleteEtudiant(id);
	    }

	    @Override
	    public void AddEtudiant(Etudiant etudiant) {
	     etudiantRepository.AddEtudiant(etudiant);
	    }

	    @Override
	    public Boolean modifEtudiant(Long id, Etudiant etudiant) {
	        return etudiantRepository.modifEtudiant(id, etudiant);
	    }


	}
