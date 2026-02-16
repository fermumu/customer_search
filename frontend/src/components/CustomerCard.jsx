import "../styles/CustomerCard.css";

export default function CustomerCard({ customer }) {
  return (
    <div className="card">
      <h3>{customer.firstName} {customer.lastName}</h3>
      <p><strong>ID Cliente:</strong> {customer.customerId}</p>
      <p><strong>Documento:</strong> {customer.identityDocument}</p>
      <p><strong>Número:</strong> {customer.identityDocumentNumber}</p>
      <p><strong>Nacionalidad:</strong> {customer.nationalityId}</p>
      <p><strong>Género:</strong> {customer.genderId}</p>
    </div>
  );
} 