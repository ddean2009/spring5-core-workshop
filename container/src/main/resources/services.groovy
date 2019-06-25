import com.flydean.services.PetStoreService

beans {

    petStore(PetStoreService, accountDao){

        accountDao=accountDao
        itemDao=itemDao
    }
}