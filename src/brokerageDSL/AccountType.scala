package brokerageDSL

sealed class AccountType(name: String)

case object CLIENT extends AccountType("Client")

case object BROKER extends AccountType("Broker")

